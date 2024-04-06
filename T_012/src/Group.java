import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {
    private String nazwa;
    private int maksStudent;
    private int iloscStudentow;
    private List<Student> lista = new ArrayList<>();

    public Group(String nazwa, int maksStudent) {
        this.nazwa = nazwa;
        this.maksStudent = maksStudent;
        iloscStudentow = 0;
    }

    public void assign(Student student) throws Exception {
        if (!student.getGrupaStudenta().isEmpty()) {
            throw new Exception("Nie ma możliwości przypisania studenta do grupy (" + nazwa + ") - już jest przypisany do grupy (" + student.getGrupaStudenta() + ")");
        }
        if (iloscStudentow >= maksStudent) {
            throw new Exception("Nie ma możliwości przypisania studenta do grupy (" + nazwa + ") - brak miejsca");
        }
        lista.add(student);
        student.setGrupaStudenta(nazwa);
        iloscStudentow++;
    }

    public List<Student> getStudents() {
        List<Student> tmp = new ArrayList<>();
        for (Student s : lista) {
            tmp.add(s);
        }
        return tmp;
    }

    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Grupa ").append(nazwa).append(" ");
        for (Student s : lista) {
            String tmp = s.toString();
            text.append(tmp).append(" ");
        }
        return text.toString();
    }

    public void remove(Student student) throws Exception {
        if (!this.nazwa.equals(student.getGrupaStudenta())) {
            throw new Exception("Nie ma możliwości usunięcia studenta z grupy (" + nazwa + ") - nie należy do tej grupy");
        }
        student.setGrupaStudenta("");
        iloscStudentow--;
        lista.remove(student);
    }
}