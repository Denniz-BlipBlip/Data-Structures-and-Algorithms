
def reverse(arr:list[int])->list[int]:

    en:int=len(arr)
    right:int=0

    for i in range(en-1,(en//2)-1,-1):
        temp:int=arr[right]
        arr[right]=arr[i]
        arr[i]=temp
        right+=1

    return arr
