class Example {
    public static void main(String[] args) {
        int arg0 = 0;
        int arg1 = 0;
        
        if(args.length > 0)
            arg0 = Integer.parseInt(args[0]);
        
        if(args.length > 1)
            arg1 = Integer.parseInt(args[1]);

        System.out.println(arg0);
        System.out.println(arg1);
    }
}