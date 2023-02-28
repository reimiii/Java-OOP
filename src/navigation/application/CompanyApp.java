package navigation.application;

import navigation.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("FranXX CODE");

        Company.Employee employee = company.new Employee();
        employee.setName("Hilmi");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
