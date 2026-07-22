//package ashraf.java8;
//
//import org.w3c.dom.ls.LSOutput;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//    }
//    Class Employee {
//        String name;
//        List<Dpt> dpt;
//        Double Salary;
//    }
//    Class DPT {
//        String Name;
//        Integer id;
//    }
//    List<Employee> employees = new ArrayList<Employee>();
// List<String> res=    emplyees.stream()
//             .flatMap(emp->emp.getDept().stream())
//            .map(Department::getName)
//    .distinct()
//    .collect(Collectors.tolist());
// System.out.println(res);
//
// employees.stream()
//         .collect(Collectors.groupingBy(
//                 emp->emp.getDept().getName(),
//        Collectors.averagingDouble(Employee::getSalary())
//    ));
// avgSalaryByDEpt.forEach((dep,res))->
//    soot
//
//
//
//}
