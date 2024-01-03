package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;

import static com.sun.javafx.scene.CameraHelper.project;
import static jdk.jfr.internal.instrument.JDKEvents.remove;
import static org.ulpgc.is1.model.ProjectType.mobileAppDevelopment;
import static org.ulpgc.is1.model.ProjectType.webDevelopment;
import static org.ulpgc.is1.model.TaskType.Design;
import static org.ulpgc.is1.model.TaskType.Programming;

public class Main {
    private static ProjectManager projectManager = new ProjectManager();

    public static void main(String[] args) {
        init();
        System.out.println("Datos del primer cliente: " + "\n" + projectManager.getCustomer(0) + "\n");
        System.out.println("Datos del segundo empleado: " + "\n" +projectManager.getEmployee(1) + "\n");
        System.out.println("Datos del proyecto del primer cliente: " + "\n" + projectManager.getCustomer(0).getProjectsAsCustomer());
        System.out.println("Tareas del proyecto: " + "\n" + projectManager.project.getTasks() + "\n");
        projectManager.customers.remove(1);
        System.out.println("Número de clientes: " + "\n" + projectManager.customers.size() + "\n");
    }

    private static void init() {
        // Crear y añadir clientes
        projectManager.addCustomer("John", "Doe", "123456789");
        projectManager.addCustomer("Mary", "Smith", "987654321");


        // Crear y añadir empleados
        projectManager.addEmployee("Juan", "juan@gmail.com");
        projectManager.addEmployee("Pedro", "pedro@gmail.com");

        projectManager.project("Super mario", "Crear videojuego de Super Mario", mobileAppDevelopment, LocalDate.of(2019, 1, 1), LocalDate.of(2023, 2, 24), 1000);

        projectManager.getCustomer(0).addProjectAsCustomer(projectManager.project);
        projectManager.getEmployee(0).addProjectAsDeveloper(projectManager.project);
        projectManager.getEmployee(1).addProjectAsManager(projectManager.project);
        projectManager.project.addTask("Menú", "Crear el menú de Super Mario", LocalDate.of(2019, 1, 1), LocalDate.of(2020, 4, 5), Design);
        projectManager.project.addTask("Personajes", "Crear los personajes de Super Mario", LocalDate.of(2020, 4, 6), LocalDate.of(2021, 7, 10), Programming);
    }
}

