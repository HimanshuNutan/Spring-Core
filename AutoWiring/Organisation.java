package com.AutoWiring;

public class Organisation {
    Employee employee;

   // public void setEmployee(Employee employee) {
   //     this.employee = employee;
   //
   //}

  public Organisation(Employee employee){
      this.employee=employee;
  }

    public void display(){
        employee.display();
    }
}
