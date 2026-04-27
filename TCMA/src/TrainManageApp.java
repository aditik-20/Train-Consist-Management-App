


    public static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Bogie> bogies = new ArrayList<>();

        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.print("How many bogies do you want to enter? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Enter bogie type (e.g., Sleeper, AC Chair, Box): ");
            String type = scanner.nextLine();
            System.out.print("Enter bogie capacity (integer): ");
            int capacity = Integer.parseInt(scanner.nextLine());
            bogies.add(new Bogie(type, capacity));
        }

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterWithLoop(bogies);
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterWithStream(bogies);
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("\nBogies entered:");
        bogies.forEach(System.out::println);

        System.out.println("\nFiltered bogies (capacity > 60):");
        streamResult.forEach(System.out::println);

        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed ...");
        scanner.close();
=======
        System.out.println("===========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code");
        System.out.println("===========================================\n");

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        CharSequence trainId = scanner.nextLine();
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        CharSequence cargoID = scanner.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        boolean isTrainValid = trainPattern.matcher(trainId).matches();
        boolean isCargoValid = cargoPattern.matcher(cargoID).matches();

        System.out.println("Validation Results:");
        System.out.println("Train ID Valid: "+isTrainValid);
        System.out.println("Cargo Code Valid: "+isCargoValid);

        System.out.println("UC11 validation completed...");

    }
}