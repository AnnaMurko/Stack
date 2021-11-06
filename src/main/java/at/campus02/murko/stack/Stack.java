package at.campus02.murko.stack;

public class Stack {
    int[] array;
    /*
    private => nur innerhalb der Klasse
    public => von überall verwendbar
    nichts =>
     */
    private int counter;

    public Stack(int[] array) {
        this.array = array;
        counter = 0;
    }

    public void push(int value) {
        if(counter>= array.length)
        {
            System.out.println("Stack is full");
            return;
        }
        array[counter] = value;
        counter++;

    }

    public int pop() {
counter--;
return array[counter];
    }
}
