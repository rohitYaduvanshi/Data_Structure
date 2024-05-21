#include <stdio.h>

int Binary_Search(int arr[], int x, int low, int high){
    while (low <= high)
    {
        int mid = low+(high - low);
        if(arr[mid] == x)
            return mid;
        if (arr[mid] < x)
        {
            low = mid+1;
        }
        else
           high = mid - 1;
    }
    return -1;
}
int main(void){
    int arr[100], x, res,n;
    printf("Enter size");
    scanf("%d", &n);

    printf("Elements:");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter Search Value: ");
    scanf("%d" , &x);

    res = Binary_Search(arr,x,0,n-1);
    if(res == -1)
       printf("Element not found");
    else 
       printf("Element found at index %d", res);
    
    return 0;
    
}