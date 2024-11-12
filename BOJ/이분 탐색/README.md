- 이분 탐색 기본 풀이법

~~~java
static void binarySearch(int srt, int en){

    if(srt > en) return;

    int mid = (srt+en)/2;

    if('문제에 맞게'){
        binarySearch(srt, mid-1);
    }
    else{
        binarySearch(mid+1, en);
    }
}
~~~