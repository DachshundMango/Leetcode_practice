class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return ;
        } else {
            for (int nums2Index = 0; nums2Index < nums2.length; nums2Index++) {
                
                for (int j = 0; j < nums1.length; j++) {
                    
                    if (m - 1 < j && nums1[j] == 0) {
                        nums1[j] = nums2[nums2Index];
                        m++;
                        break;

                    } else if (nums1[j] <= nums2[nums2Index]) {
                        continue;

                    } else {

                        int startIndex = j;
                        int finalIndex = m; 

                        while (finalIndex > startIndex) {
                            nums1[finalIndex] = nums1[finalIndex-1];
                            finalIndex--;
                        }
                        nums1[j] = nums2[nums2Index];
                        m++;
                        break;
                    } 
                }     
            }



        }


        
    }
}