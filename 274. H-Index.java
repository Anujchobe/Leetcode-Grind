Arrays.sort(citations);
        
        int n = citations.length;
        int hIndex = 0;

        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            // Number of papers with at least citations[i] citations
            int h = n - i;

            // Check if citations[i] is greater than or equal to h
            if (citations[i] >= h) {
                hIndex = h;
                break;
            }
        }
