public int[] seriesUp(int n) {
  int[] A=new int[n*(n+1)/2];
	int i=0;
	for(int k=1; k<=n; k++)
		for(int p=1; p<=k; ++p)
			A[i++]=p;
	return A;
}

//Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

//seriesUp(3) → [1, 1, 2, 1, 2, 3]
//seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
//seriesUp(2) → [1, 1, 2]
