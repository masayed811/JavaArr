public class DuplicateValuesOfIntegerValues {
    public static void main(String[] args)
    {
        int arr[] = {2019, 2, 5, 5, 6, 6, 7, 200,800,2019,200};

        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }
}
