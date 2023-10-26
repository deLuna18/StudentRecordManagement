import java.util.Scanner;

class Student{   
   private int student_Id;
   private String first_name;
   private String middle_name;
   private String last_name;
   private String suffix;
   private int age; 
   private String yr_lvl;
   private long phone_number; 
   private String email; 
   
   
   //Constructors
   public Student(int student_Id, String first_name, String middle_name, String last_name, String suffix, int age, String yr_lvl, long phone_number, String email) {
      this.student_Id = student_Id;
      this.first_name = first_name;
      this.middle_name = middle_name;
      this.last_name = last_name;
      this.suffix = suffix;
      this.age = age;
      this.yr_lvl = yr_lvl;
      this.phone_number = phone_number;
      this.email = email;
    }
   
   //Getters
   public int getStudentId(){
      return student_Id;
   }
   
   public String getFirstName(){
      return first_name;
   }
   
   public String getMiddleName(){
      return middle_name;
   }
   
   public String getLastName(){
      return last_name;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public int getAge(){
      return age;
   }
   
   public String getYrLvl(){
      return yr_lvl;
   }
   
   public long getPhoneNumber(){
      return phone_number;
   }
   
   public String getEmail(){
      return email;
   }
   
   //Setters
   public void setStudentId(int student_Id){
      this.student_Id = student_Id;   
   }
   
   public void setFirstName(String fName){
      this.first_name = fName;
   }
   
   public void setMiddleName(String mName){
      this.middle_name = mName;
   }
   
   public void setLastName(String lName){
      this.last_name = lName;
   }
   
   public void setSuffix(String suffix){
      this.suffix = suffix;
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public void setYr_Lvl(String yr_lvl){
      this.yr_lvl = yr_lvl;
   }
   
   public void setPhone_Number(long phone_number){
      this.phone_number = phone_number;
   }
   
   public void setEmail(String email){
      this.email = email;
   }

   //Custom Methods/Computed Properties
   public String getFullName(){
      return first_name + " " + middle_name + " " + last_name + " " + suffix;  
   }
   
}

class Course {
   private String course_name;
   private int course_code;
   private String department;

   public Course(String course_name, int course_code, String department) {
      this.course_name = course_name;
      this.course_code = course_code;
      this.department = department;
   }
   
   //Getters
   public String getCourseName(){
      return course_name;
   }
   
   public int getCourseCode(){
      return course_code;
   }
   
   public String getDepartment(){
      return department;
   }
   
   //Setters
   public void setCourseName(String course_name){
      this.course_name = course_name;
   }
   
   public void setCourseCode(int course_code){
      this.course_code = course_code;
   }
   
   public void setDepartment(String department){
      this.department = department;
   }
}


public class StudentRecordManagement{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

   int choice; 
   Student student = null;
   Course course = null;
   
   do{
      // Initial Selection Menu
      System.out.println("Initial Selection Menu");
      System.out.printf("========================================\n\n");
      System.out.printf("Student Record Management App v1\n");
      System.out.println("Selection Menu:");
      System.out.println("---------------------------------------");
      System.out.println("1. Create Student Record");
      System.out.println("0. Exit");
      System.out.println("---------------------------------------");

      System.out.print("Enter Selection: ");
      choice = scanner.nextInt();
      System.out.printf("\n=======================================\n");
      
      if (choice == 1) {
         // Student Record
         System.out.printf("\n\n\nStudent Profile Details");
         System.out.printf("\n=======================================\n\n");
         System.out.printf("Student Record Management App v1\n");
         System.out.println("Enter Student Details:");
         System.out.println("-----------------------------------");
         System.out.print("Student ID No.: ");
         int studentId = scanner.nextInt();
         scanner.nextLine(); 
         System.out.print("First Name: ");
         String firstName = scanner.nextLine();
         System.out.print("Middle Name: ");
         String middleName = scanner.nextLine();
         System.out.print("Last Name: ");
         String lastName = scanner.nextLine();
         System.out.print("Suffix: ");
         String suffix = scanner.nextLine();
         System.out.print("Age: ");
         int age = scanner.nextInt();
         scanner.nextLine();
         System.out.print("Year Level: ");
         String yearLevel = scanner.nextLine();
         System.out.print("Phone Number: ");
         long phoneNumber = scanner.nextLong();
         scanner.nextLine();
         System.out.print("Email: ");
         String email = scanner.nextLine();

         student = new Student(studentId, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email);   
         
         // Course Selection
         System.out.println("Select Student Course Details:");
         System.out.println("----------------------------------------");
         System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
         System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
         System.out.println("3. Associate of Computer Technology (ACT)");
         System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
         System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
         System.out.println("----------------------------------------");
         System.out.print("Enter Selection: ");
         int courseSelection = scanner.nextInt();
         scanner.nextLine();

         if (courseSelection >= 1 && courseSelection <= 5) {
         String courseName = "";
         
            switch (courseSelection) {
            case 1:
               courseName = "Bachelor of Science in Information Technology (BSIT)";
               break;
            case 2:
               courseName = "Bachelor of Science in Computer Science (BSCS)";
               break;
            case 3:
               courseName = "Associate of Computer Technology (ACT)";
               break;
            case 4:
               courseName = "Bachelor of Science in Mechanical Engineering (BSME)";
               break;
            case 5:
               courseName = "Bachelor of Science in Civil Engineering (BSCE)";
               break;
            }

            // Department Selection
            System.out.println("Select Student Department:");
            System.out.println("----------------------------------------");
            System.out.println("1. College of Computer Studies Department");
            System.out.println("2. College of Engineering Department");
            System.out.println("----------------------------------------");
            System.out.print("Enter Selection: ");
            int departmentSelection = scanner.nextInt();
            scanner.nextLine();

            String department = "";

            if (departmentSelection == 1) {
               department = "College of Computer Studies Department";
            } else if (departmentSelection == 2) {
               department = "College of Engineering Department";
            } else {
               System.out.println("Invalid department selection.");
            continue; 
            }
            
            course = new Course(courseName, courseSelection, department);
            System.out.println(" ");
         } else {
            System.out.println("Invalid course selection.");
         }        
         System.out.printf("\n=======================================\n");
         System.out.printf("\n\n"); 
          
         int subChoice;
         do {
            System.out.println("Student Record Management App v1");
            System.out.println("1. Update Student Profile Details");
            System.out.println("2. Update Student Course Details");
            System.out.println("3. Display Student Details");
            System.out.println("0. Exit");
            System.out.print("Enter Selection: ");
            subChoice = scanner.nextInt();
            System.out.printf("\n=======================================\n\n");
            
            switch (subChoice) {
               case 1:
                  int UPChoice;
                  do {
                     System.out.println("Student Profile Details Update Selection Menu:");
                     System.out.println("---------------------------------------------");
                     System.out.println("1. Update Student ID No.");
                     System.out.println("2. Update First Name");
                     System.out.println("3. Update Middle Name");
                     System.out.println("4. Update Last Name");
                     System.out.println("5. Update Suffix");
                     System.out.println("6. Update Age");
                     System.out.println("7. Update Year Level");
                     System.out.println("8. Update Phone Number");
                     System.out.println("9. Update Email");
                     System.out.println("0. Return");
                     System.out.printf("\n----------------------------------------------\n");
                     System.out.print("Enter Selection: ");
                     UPChoice = scanner.nextInt();
                     scanner.nextLine();             
                     switch (UPChoice) {
                        case 1:
                           System.out.print("Update Student ID No.: ");
                           int newStudentId = scanner.nextInt();
                           student.setStudentId(newStudentId);
                           break;
                        case 2:
                           System.out.print("Update First Name: ");
                           String newFirstName = scanner.nextLine();
                           student.setFirstName(newFirstName);
                           break;
                        case 3:
                           System.out.print("Update Middle Name: ");
                           String newMiddleName = scanner.nextLine();
                           student.setMiddleName(newMiddleName);
                           break;
                        case 4:
                           System.out.print("Update Last Name: ");
                           String newLastName = scanner.nextLine();
                           student.setLastName(newLastName);
                           break;
                        case 5:
                           System.out.print("Update Suffix: ");
                           String newSuffix = scanner.nextLine();
                           student.setSuffix(newSuffix);
                           break;
                        case 6:
                           System.out.print("Update Age: ");
                           int newAge = scanner.nextInt(); 
                           student.setAge(newAge);
                           break;
                        case 7:
                           System.out.print("Update Year Level: ");
                           String newYr_Lvl = scanner.nextLine();
                           student.setYr_Lvl(newYr_Lvl); 
                           break;
                        case 8:
                           System.out.print("Update Phone Number: ");
                           long newPhoneNo = scanner.nextLong(); 
                           student.setPhone_Number(newPhoneNo); 
                           break;
                        case 9:
                           System.out.print("Update Email: ");
                           String newEmail = scanner.nextLine();
                           student.setEmail(newEmail); 
                           break;
                        case 0:
                           System.out.print("Return");
                           return;
                        default:
                           System.out.println("Invalid choice. Please try again.");
                           break;
                     }
                     System.out.println("----------------------------------------------");
                     System.out.print("Enter Selection: ");
                     System.out.printf("\n\n=======================================\n");
                  } while (UPChoice != 0);
                  break;
               case 2:
                  System.out.println("Select Student Course Details: (Update)");
                  System.out.println("----------------------------------------");
                  System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
                  System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
                  System.out.println("3. Associate of Computer Technology (ACT)");
                  System.out.println("4. Bachelor of Science in Civil Engineering (BSCE)");
                  System.out.println("----------------------------------------");
                  System.out.print("Enter Selection: ");
                  int courseUpdateChoice = scanner.nextInt();
                  scanner.nextLine(); 
                  break;
               case 3:
                  // Display Student and Course Details
                  System.out.println("Student Details");
                  System.out.println("---------------------------------------------\n");
                  System.out.println("Student ID: " + student.getStudentId());
                  System.out.println("Name: " + student.getFullName());
                  System.out.println("Age: " + student.getAge());
                  System.out.println("Year Level: " + student.getYrLvl());
                  System.out.println("Phone Number: " + student.getPhoneNumber());
                  System.out.println("Email: " + student.getEmail());
             
                  if (course != null) {
                     System.out.println("Course Name: " + course.getCourseName());
                     System.out.println("Course Code: " + course.getCourseCode());
                     System.out.println("Department: " + course.getDepartment());
                     System.out.printf("\n\n=======================================\n");

                  } else {
                     System.out.println("Course details not available.");
                  }
                  break;
                  case 0:
                     System.out.print("Exit");
                     System.exit(0);
                  break;
               default:
                  System.out.println("Invalid choice. Please try again.");
                  break;
               }
         } while (subChoice != 0);         
      }else if (choice != 0){
         System.out.println("Invalid choice. Please try again.");
      }
   } while (choice != 0);
      System.out.println("Exit");
   }
}
     