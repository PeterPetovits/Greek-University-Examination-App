package gr.aueb.sweng22.team04.dao;

import gr.aueb.sweng22.team04.model.Department;

public interface DepartmentDAO {

    void addDepartment(Department entity);

    Department findDepartment(int ID);
}