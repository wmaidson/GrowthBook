## Programação orientada a objetos: polimorfismo e interfaces

| Nome | Descrição |
| ------ | ------ |
|  [PolymorphismTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/PolymorphismTest.java) |  Atribuindo referências de superclasse e subclasse a variáveis de superclasse e de subclasse |
|  [Employe](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/Employee.java) |  Superclasse abstrata Employee. |
|  [SalariedEmployee](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/SalariedEmployee.java) |  A classe concreta SalariedEmployee estende a classe abstrata Employee.  |
|  [HourlyEmployee](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/HourlyEmployee.java) |  Classe HourlyEmployee estende Employee. |
|  [CommissionEmployee](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/CommissionEmployee.java) |  Classe CommissionEmployee estende Employee. |
|  [BasePlusCommissionEmployee](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/BasePlusCommissionEmployee.java) |  Classe BasePlusCommissionEmployee estende a CommissionEmployee. |
|  [PayrollSystemTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/PayrollSystemTest.java) |  Programa de teste da hierarquia Employee. |
|  [Payable](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/Payable.java) |  Declaração da interface Payable. |
|  [Invoice](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/Invoice.java) |  Classe Invoice que implementa Payable. |
|  [Employee2](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/Employee2.java) |  Superclasse abstrata Employee que implementa Payable. |
|  [SalariedEmployee2](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/SalariedEmployee2.java) |  classe SalariedEmployee que implementa o método getPaymentAmount da interface Payable. |
|  [PayableInterfaceTest](https://github.com/wmaidson/GrowthBook/blob/master/Java/Java-8/10-Object-oriented-programming-polymorphism-and-interfaces/chapter-10/src/PayableInterfaceTest.java) |  Programa de teste da interface Payable que processa Invoices e  Employees polimorficamente. |

