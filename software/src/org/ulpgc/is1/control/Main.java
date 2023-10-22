package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;

import static org.ulpgc.is1.model.ProjectType.webDevelopment;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();
        projectManager.addCustomer(new Customer("John", "Doe", "123456789"));
        projectManager.addCustomer(new Customer("Jane", "McDonald's", "98765432n"));
        projectManager.addEmployee(new Employee("Juan", "juan@gmail.com"));
        projectManager.addEmployee(new Employee("Pedro", "pedro@gmail.com"));
        projectManager.projects.add(new Project("bhhrsb v",
                "svbracd",
                webDevelopment,
                projectManager.getCustomers().get(0),
                projectManager.getEmployees().get(1),
                projectManager.getEmployees().get(0),
                LocalDate.of(2020, 12, 12),
                LocalDate.of(2020, 12, 12),
                123));
                /*projectManager.projects.get(0).addTask(new Task("Task1", "Task description",
                TaskType.Analysis,
                LocalDate.of(2020, 12, 12),
                LocalDate.of(2020, 12, 12),
                6));*/

        ///Imprimir por pantalla los datos del primer customer
        System.out.println("Datos del primer cliente: " + "\n" + projectManager.getCustomers().get(0).toString());
        ///Imprimir por pantalla los datos del segundo employee.
        System.out.println("Datos del segundo empleado: " + "\n"+ projectManager.getEmployees().get(1).toString());
        ///Imprimir por pantalla los datos del proyecto del primer cliente
        System.out.println("Datos del proyecto del primer cliente: " + "\n" + projectManager.projects.get(0).toString());
        ///Imprimir por pantalla los datos de las tareas del proyecto
        /*System.out.println("Datos de las tareas del proyecto: " + "\n" + projectManager.projects.get(0).getTasks().get(0).toString());*/
        ///Borrar el segundo cliente.
        projectManager.getCustomers().remove(1);
        ///Imprimir por pantalla el número de clientes.
        System.out.println("Numero de clientes: " + projectManager.getCustomers().size());
        }
    }

