public class Duke {

    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        String hline = "_______________________________________________________";
        String greetString = " Hello! I'm Duke\n" + " What can I do for you?\n" + hline;
        String exitString = " Bye. Hope to see you again soon!\n" + hline;

        System.out.println(hline);
        System.out.println(logo + greetString);

        /* Main Code */

        System.out.println(exitString);
    }
}
