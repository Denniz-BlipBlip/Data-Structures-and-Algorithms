
def bubbleSort(items):
    size=len(items)

    for i in range(0,size,1):
        for j in range(0,size-i-1,1):
            if items[j]>items[j+1]:
                temp=items[j]
                items[j]=items[j+1]
                items[j+1]=temp

