# Arrary partition i

* �����ǲ�������
```
1��������
2����������
3��������
......
```
* ѡ��ʲô����
```
1���鲢����������ʱ�临�Ӷ�СO(nlogn)���ȶ���������Ҫ�����ռ�O(n)����һ�㶼����������
2����������ƽ��ʱ�临�Ӷ�ΪO(nlogn),���ʱ�临�Ӷ�ΪO(nlogn)���ʱ�临�Ӷ�ΪO(n2),���ӿռ�O(logn)~O(n),���ȶ�
3���Ż��Ŀ�������ʹ����ֵ������ֵС��47ʱʹ�ü򵥲�������
4��д�����㷨ʹҪ����ͳһ�Ľӿڣ��磺
void Quick_Sort(ElementType A[],int N)
{
    Quicksort( A, 0, N-1 );
}
```
* �ݹ��㷨
```
1��������̫��ʱ�����ռ��ϵͳ��ջ���������
```