package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;

import static com.sun.javafx.scene.CameraHelper.project;
import static org.ulpgc.is1.model.ProjectType.webDevelopment;

public class Main {
    public static void main(String[] args) {

        ProjectManager projectManager = new ProjectManager();
        ///Crear dos tareas vinculadas al proyecto.
                Project.addTask(new Task("Task1", "Task description",
                TaskType.Analysis,
                LocalDate.of(2020, 12, 12),
                LocalDate.of(2021, 12, 12),
                6));

                Project.addTask(new Task("Task2", "Task2 description2",
                TaskType.Test,
                LocalDate.of(2020, 11, 15),
                LocalDate.of(2021, 12, 15),
                8));

        ///Imprimir por pantalla los datos del primer cliente.
        System.out.println("Datos del primer cliente: " + "\n" + projectManager.getCustomer().get(0).toString());

        ///Imprimir por pantalla los datos del segundo empleado.
        System.out.println("Datos del segundo empleado: " + "\n"+ projectManager.getEmployee().get(1).toString());

        ///Imprimir por pantalla los datos del proyecto del primer cliente
        System.out.println("Datos del proyecto del primer cliente: " + "\n" + projectManager.project.toString());

        ///Imprimir por pantalla los datos de las tareas del proyecto
        System.out.println("Datos de las tareas del proyecto: " + "\n" + projectManager.project.getTasks().get(0).toString());

        ///Borrar el segundo cliente.
        projectManager.getCustomer().remove(1);

        ///Imprimir por pantalla el número de clientes.
        System.out.println("Numero de clientes: " + projectManager.getCustomer().size());
        }
    }

