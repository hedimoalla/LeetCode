class Sum {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long total = 0L;
		for(long i = 0L; i < 36854775807L; i++){
			total += i;

		}
		System.out.println(total);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
}

//9223372036854775807L