package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/completed")
    public List<Task> getCompletedTasks(@RequestParam boolean status) {
        return taskRepository.findByCompleted(status);
    }

    @GetMapping("/sorted")
    public List<Task> getTasksSortedByDueDate() {
        return taskRepository.findAllByOrderByDueDateAsc();
    }

    @GetMapping("/user/{username}")
    public List<Task> getTasksByUser(@PathVariable String username) {
        return taskRepository.findByUsername(username);
    }

    @GetMapping("/")
    public String homePage(Model model) {
        List<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }


//    @PostMapping("/add")
//    public String addTask(@ModelAttribute Task task) {
//        taskRepository.save(task);
//        return "redirect:/";
//    }


    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(task);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
}