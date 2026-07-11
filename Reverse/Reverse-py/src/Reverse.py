
def reverse(arr:list[int])->list[int]:

    en:int=len(arr)
    right:int=0

    for i in range(en-1,(en//2)-1,-1):
        temp:int=arr[right]
        arr[right]=arr[i]
        arr[i]=temp
        right+=1

    return arr

def reverseStr(word:str):
    en=len(word)
    rev:str=""

    for i in range(en-1,0-1,-1):
        rev=rev+word[i]

    print(word[::-1])
    print(rev)
