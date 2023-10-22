package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;

import static org.ulpgc.is1.model.ProjectType.webDevelopment;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();
        ///Crear dos clientes. (*) En el caso que el cliente tenga un número de teléfono no válido se almacenará el valor: “XXXX”.
        projectManager.addCustomer(new Customer("John", "Doe", "123456789"));
        projectManager.addCustomer(new Customer("Jane", "McDonald's", "98765432n"));

        ///Crear dos empleados.
        projectManager.addEmployee(new Employee("Juan", "juan@gmail.com"));
        projectManager.addEmployee(new Employee("Pedro", "pedro@gmail.com"));

        ///Crear un proyecto vinculado al primer cliente. El primer empleado será desarrollador en el proyecto. El segundo será el manager.
                projectManager.projects.add(new Project("Project1",
                "Project description",
                webDevelopment,
                projectManager.getCustomers().get(0),
                projectManager.getEmployees().get(1),
                projectManager.getEmployees().get(0),
                LocalDate.of(2020, 12, 12),
                LocalDate.of(2021, 12, 12),
                250000));
        ///Crear dos tareas vinculadas al proyecto anterior.
                projectManager.projects.get(0).addTask(new Task("Task1", "Task description",
                TaskType.Analysis,
                LocalDate.of(2020, 12, 12),
                LocalDate.of(2021, 12, 12),
                6));

                projectManager.projects.get(0).addTask(new Task("Task2", "Task2 description2",
                TaskType.Test,
                LocalDate.of(2020, 11, 15),
                LocalDate.of(2021, 12, 15),
                8));

        ///Imprimir por pantalla los datos del primer cliente.
        System.out.println("Datos del primer cliente: " + "\n" + projectManager.getCustomers().get(0).toString());

        ///Imprimir por pantalla los datos del segundo empleado.
        System.out.println("Datos del segundo empleado: " + "\n"+ projectManager.getEmployees().get(1).toString());

        ///Imprimir por pantalla los datos del proyecto del primer cliente
        System.out.println("Datos del proyecto del primer cliente: " + "\n" + projectManager.projects.get(0).toString());

        ///Imprimir por pantalla los datos de las tareas del proyecto
        System.out.println("Datos de las tareas del proyecto: " + "\n" + projectManager.projects.get(0).getTasks().get(0).toString());

        ///Borrar el segundo cliente.
        projectManager.getCustomers().remove(1);

        ///Imprimir por pantalla el número de clientes.
        System.out.println("Numero de clientes: " + projectManager.getCustomers().size());
        }
    }

