package eci.cosw.data.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {

    private String description, priority, dueDate, responsible, status;

    public Todo() {}

    public Todo(String description, String priority, String dueDate, String responsible, String status) {
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.responsible = responsible;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
