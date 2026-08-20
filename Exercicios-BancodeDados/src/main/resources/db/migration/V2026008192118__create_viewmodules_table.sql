CREATE OR REPLACE VIEW modules_view AS
SELECT
    m.id AS module_id,
    m.name AS module_name,
    e.id AS employee_id,
    e.name AS employee_name,
    e.salary AS employee_salary,
    e.birthday AS employee_birthday
FROM modules m
         INNER JOIN accesses a ON a.module_id = m.id
         INNER JOIN employees e ON e.id = a.employee_id;