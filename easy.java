class Manusia { //isi node manusia hebat
    String nama;
    String skill;
    int umur;
    String hobi;
    Manusia next;

    public Manusia(String nama, String skill, int umur, String hobi) {
        this.nama = nama;
        this.skill = skill;
        this.umur = umur;
        this.hobi = hobi;
        this.next = null;
    }
}

class LinkedList { //linkedlist nya
    Manusia head;

    public void addFirst(String nama, String skill, int umur, String hobi) { //metod add fisrst
        Manusia newManusia = new Manusia(nama, skill, umur, hobi);
        newManusia.next = head;
        head = newManusia; 
    }

    public void addLast(String nama, String skill, int umur, String hobi) { //method add last
        Manusia newManusia = new Manusia(nama, skill, umur, hobi);
        if (head == null) {
            head = newManusia;
        } else {
            Manusia temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newManusia;
        }
    }

    public void deleteFirst() { //metod delete first
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    public void deleteLast() { //metod delete last
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Manusia temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Manusia temp = head;
            while (temp != null) {
                System.out.println("Nama: " + temp.nama + ", Skill: " + temp.skill +
                                   ", Umur: " + temp.umur + ", Hobi: " + temp.hobi);
                temp = temp.next;
            }
        }
    }
}

public class easy {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast("Vadel", "Dance Geterrr", 19, "Dance");
        list.addLast("Loli", "ATM Berjalan", 16, "Liat Vadel");
        list.addLast("Agus", "Agus Sakit", 35, "Donasi");
        list.addLast("Fufu Fafa", "Roasting", 30, "Buka Kaskus");
        System.out.println("List sebelum add first:");
        list.displayList();

        list.addFirst("Kak Gem", "Kasi Faham", 32, "Bernafas");

        System.out.println("\nList setelah penambahan:");
        list.displayList();

        list.deleteLast();

        list.deleteFirst();

        System.out.println("\nList setelah penghapusan:");
        list.displayList();
    }
}