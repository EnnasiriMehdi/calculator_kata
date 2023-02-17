package org.example;

public class ArgParser {
    private String[] args;

    public ArgParser(String[] args) {
        this.args = args;
    }

    public ProgramArgs parse() {
        ProgramArgs programArgs = new ProgramArgs();
        if (args.length < 2 || args.length > 3) {
            System.out.println("Invalid number of arguments");
            System.exit(1);
        }
        if (args.length<3){
            programArgs.setOperator(args[0]);
            programArgs.setFilename(args[1]);
            programArgs.setLogging(false);
        } else{
            programArgs.setOperator(args[0]);
            programArgs.setFilename(args[1]);
            programArgs.setLogging(args[2].equals("-log"));
        }
        return programArgs;
    }
}
