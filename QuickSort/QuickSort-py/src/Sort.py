
def partition(arr,low,high):
    pivot=arr[high]
    i=low-1

    for j in range(low,high,1):
        if arr[j]<pivot:
            i+=1
            temp=arr[i]
            arr[i]=arr[j]
            arr[j]=temp

    temp=arr[i+1]
    arr[i+1]=arr[high]
    arr[high]=temp
    return i+1

def quick_sort(arr,low,high):
    if low<high:
        pi=partition(arr,low,high)
        quick_sort(arr,low,pi-1)
        quick_sort(arr,pi+1,high)
