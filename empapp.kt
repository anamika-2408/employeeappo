package com.axis.app

import com.axis.modal.Employee
import com.axis.service.Employeeservice

fun main() {

    val employeeService = Employeeservice()


//Adding Employee
    val employee = Employee(106, "Vicky", "HR", 45500)
    employeeService.addNewEmployee(employee)

    employeeService.viewAllEmployees()
}