-- 2023-09-20
-- sal �� 1000���� 2000 ���� ���
select ename,sal,comm from emp where sal>=1000 and sal<=2000; --���1
select ename,sal,comm from emp where sal BETWEEN 1000 and 2000; --���2

--sal �� 1000 2000�� �����ϰ� ���
select ename,sal,comm from emp where sal not BETWEEN 1000 and 2000; --���1
select ename,sal,comm from emp where sal<1000 or sal>2000;  --���2

--comm �� null �� ����Ÿ ��ȸ
select * from emp where comm is null;
--comm �� null �� �ƴ� ����Ÿ ��ȸ
select * from emp where comm is not null;
--comm �� null �ΰ�� 0���� ���, ������ �÷��� sal+comm�� ���Ѱ��� ���
select ename,sal,comm,sal+comm from emp; --���� + null = null
--NVL(�÷���,��) : �ش� �÷����� null �̸� 0���� ���(mysql ������ isnull)
select ename,sal,NVL(comm,0),sal+NVL(comm,0) from emp;

--���߿� �ڹٷ� ��������� �÷��ε����� �÷������� ��������.
--�׷��� �÷����� ������ ��� ��Ī�� �����Ѵ�
select ename as "�����",sal as "����" from emp; -- "��Ī" �� ������ ������� ""����
select ename �����,sal ���� from emp;
select empno "��� ��ȣ", sal ���� from emp; --��Ī�� ������ �ִ°�� ""�ʼ����

select ename ����� ,sal ���� ,NVL(comm,0) ������ ,sal+NVL(comm,0) �ѿ��� from emp;

--�� �۰��� ���
select count(*) from emp;
select count(*) count from emp;

-- ���ڿ��� �̾ ��� ||
select ename||'���� ������ '||job||'�Դϴ�' member from emp;

--xx ���� �� ������ xxx �Դϴ�
select ename||'���� �� ������ '||(NVL(sal,100)+NVL(comm,100))||'�Դϴ�' ȸ������ from emp;

--empno ������ ��ȸ
select empno,ename from emp where empno = 7369 or empno = 7788 or empno = 7900;

--������ ��ȸ�� in�� ����غ���
select empno,ename from emp where empno in (7369,7788,7900);

--���� 3���� empno �� ���� ���
select empno,ename from emp where empno not in (7369,7788,7900);

--ename, job �� ����ϴµ� job �� salesman �̰ų� analyst,manager 3���� ������ ���
select * from emp where job in('SALESMAN','ANALYST','MANAGER');

--��¥�� ����
select * from emp where hiredate='80/12/17';
select * from emp where hiredate='1980-12-17';
select * from emp where hiredate>='1980-01-01' and hiredate<='1981-10-10';

--���� ��¥ ��ȸ
select sysdate from dual;
--���� ��¥
select sysdate+1 from dual;
--to_char ��ȯ�Լ� �̿��ؼ� ��ȸ
select to_char(sysdate, 'yyyy-mm-dd') from dual;
select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss') from dual;
select to_char(sysdate, 'yyyy-mm-dd am hh:mi') from dual; --��������ǥ�� am�Ǵ�pm
select to_char(sysdate, 'yyyy-mm-dd ') from dual;

--emp ���� ename,hiredate (yyyy-mm-dd) �� ����ϴµ� 1981�⿡ �Ի��ѻ���� ���
--������ ����� , �Ի���
select ename �����,to_char(hiredate,'yyyy-mm-dd') �Ի��� from emp where
 to_char(hiredate,'yyyy')='1981';

--�׷��Լ�: count,max,min,avg,sum
select count(*) from emp; -- ��ü ����Ÿ ����
select avg(sal) from emp; -- sal �� ��� 
select round (avg(sal),1) from emp; -- ���� ����� ���Ҷ��� round �Լ��� ���̻��
select round (avg(sal),0) from emp; -- 2073
select round (avg(sal),-1) from emp; -- 2070
select round (avg(sal),-2) from emp; --2100

select sum(sal) from emp; -- sal �� ���հ� 29025
select min(sal) from emp; -- �޿� �ּҰ�
select max(sal) from emp; -- �޿� �ִ밪

--���� ���� �޿��� �޴� ����� �̸��� �˾ƺ���
select ename �����,sal ���� from emp where sal =(select min(sal) from emp);
--���� ū �޿�
select ename �����,sal ���� from emp where sal =(select max(sal) from emp);

--SCOTT �� ������ ���� ������ ���� ����� ��ȸ(ENAME,JOB,SAL)
select ename,job,sal from emp where job = (select job from emp where ename='SCOTT');
--allen ���� �� ���� ������ �޴� ����� �ο�����?
select count(*) �ο��� from emp where sal > (select sal from emp where ename='ALLEN'); 

--group by
--job �������� �ϴ� �ο����� ���غ���
select JOB ����,COUNT(*) �ο��� from emp GROUP BY JOB;
--���� ����� ������ ������������ ���
select JOB ����,COUNT(*) �ο��� from emp GROUP BY JOB ORDER BY ����;
select JOB ����,COUNT(*) �ο��� from emp GROUP BY JOB ORDER BY 1;
--�ο����� �������� ���� ���
select JOB ����,COUNT(*) �ο��� from emp GROUP BY JOB ORDER BY �ο���;
select JOB ����,COUNT(*) �ο��� from emp GROUP BY JOB ORDER BY 2;

--�������� �ο���,��տ����� ��������, �ְ����� ����غ���
SELECT JOB ����,COUNT(*)�ο���,ROUND(AVG(SAL),0) ��տ���,MAX(SAL) �ְ���
,MIN(SAL) �������� FROM EMP GROUP BY JOB;

--�׷쿡 ���� ������ �� ��� having
-- ���� sql ���� �ο����� 3���̻��� �׷츸 ���
SELECT JOB ����,COUNT(*)�ο���,ROUND(AVG(SAL),0) ��տ���,MAX(SAL) �ְ���
,MIN(SAL) �������� FROM EMP GROUP BY JOB having count(*)>=3;

-- ����Ŭ �Լ���
-- �����Լ�
select abs(-5),abs(5) from dual; --abs : ���밪���� ���(�����)
select ceil(2.1),ceil(2.9) from dual; --ceil : �ø�
select floor(2.1),floor(2.7) from dual; --ceil : ����
select mod(7,2) from dual; --mod : ������
select power(2,3) from dual; --power : 2�� 3��

--��ȯ�Լ�
select '7'+7 from dual;
select to_number('7')+7 from dual;
select to_char(sysdate,'yyyy-mm-dd') from dual;

--�����Լ�
select concat('hello','world') from dual; --���ڿ� ��ġ��
select 'hello'||'world' from dual; --���ڿ� ��ġ��

--���߿� �ڹٿ��� �ܾ��Է��ϸ� �� �ܾ ������ �Խñ��� ����Ҷ�
select * from board where subject like '%'||������||'%'; -- ����Ŭ
select * from board where subject like concat('%',������,'%'); --mysql

select LPAD(23550,10,'*') from dual; --�� 10�ڸ��� ���¿����ڸ� *�� ä���
select RPAD(23550,10,'*') from dual; --�� 10�ڸ��� ���¿������ڸ� *�� ä���

select initcap('hello') from dual; --ù���ڸ� �빮�ڷ�
select lower('hello') from dual; --��ü �ҹ��ڷ�
select upper('hello') from dual; --��ü �빮�ڷ�

select initcap(ename),lower(ename),upper(ename) from emp;

select substr('HELLP KITTY',3,3) from dual; -- 3��°���� 3���� ����
select substr('HELLP KITTY',-3,3) from dual; -- �ڿ��� 3��°���� 3���� ����

--ename, sal ���(ename�� �α��ڸ� �����ؼ� ����� �ڿ� *3�����̱�, 
--sal �� �� 7�ڸ��� ����ϤѤ����� �տ� **�� ä���� ���
select substr(ename,1,2)||'***' �����,lpad(sal,7,'*') ���� from emp;

--���� ���� ����
select '*'||'       hello          '||'*' from dual;
select '*'||trim('       hello        ')||'*' from dual;

select decode(3,1,'one',2,'two',3,'three',4,'four') from dual;
select ename,deptno,decode(deptno,10,'�λ�',20,'�뱸',30,'���ֵ�') from emp;

--����Ǯ��
--1. emp���̺��� ename a�� s�� �����ϴ»�� ���(��ҹ��� �������)
select ename from emp where lower(ename) like 'a%' or lower(ename) like 's%';

  
--2. emp���̺��� ename ���� �ι�° ���ڰ� 'A' �λ�� ���
select ename from emp where ename like '_A%'; 

  
--3. job ���� ���� �������ϰ�� �ѹ����� ����Ͻÿ�(������������ ���)
select distinct job from emp order by job;

  
--4. job �������� �ο����� ���Ͻÿ�(�ο����� ������������ ���)
select job,count(*) count from emp group by job order by count desc;



--5. job �������� sal �� ��ձ޿��� ���Ͻÿ�,��ձ޿��� ������������ ���
select job,round(avg(sal),0) ��ձ޿� from emp group by job;



--6. job �������� sal �� �ִ밪�� �ּҰ��� ���Ͻÿ�
select job,min(sal),max(sal) from emp group by job;



--7. deptno �� 10�ΰ�� 'ȫ����'
--   20 �ΰ�� '���ߺ�' 30�ΰ�� '������' �μ��� ���Ͽ�
--   ename, �μ� �� ����Ͻÿ�
select ename, deptno , decode(deptno,10,'ȫ����',20,'���ߺ�',30,'������') �μ� from emp;

  
--8. �޿�(sal)�� sal �� ��պ��� �� ���� ����� ename �� sal �� ����Ͻÿ�
select ename,sal from emp where sal > (select avg(sal) from emp);



--9. hiredate ���� ���� 5���� ����� ename �� hiredate �� ����Ͻÿ�
select ename,to_char(hiredate,'yyyy-mm-dd') from emp where to_char(hiredate,'mm') = 05;



--10. SCOTT �� �޿��� �����ϰų� �� ���� �޴� ������ �޿��� ����϶�
select ename,sal from emp where sal >= (select sal from emp where ename='SCOTT'); 


