package br.com.projeto.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.chrono.ChronoLocalDateTime;
import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    @Column(length = 50)
    private String title;
    private LocalDateTime StartAt;
    private LocalDateTime EndAt;
    private String priority;
    private UUID idUser;
    @CreationTimestamp
    private LocalDateTime createdAt;
public void setTitle(String title) throws Exception {
    if (title.length() > 50){
        throw new Exception("O Titulo no maximo deve conter 50 caracters");
    }
}

}
