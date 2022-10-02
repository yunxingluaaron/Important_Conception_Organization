## 1. 关于Python的语法的

### 关于 object, class and instance的概念

<p align = 'left'>
(a) 在大多数的情况下，class 和 instance 的概念是可以互换的，他们都是类（抽象模板）的实例化<br> 
(b) 在下面的代码中，在类的括号后面加入另外一个类的名字，代表的是继承关系; 如果没有继承关系，那么就直接填入“object”这个词<br>
(c) 在通过类创建实例的时候，必须给实例填写属性(比如，年龄，性别)，这时候要用到构造函数/内置方法 "def __init__"<br>
(d) def __init__(a,b,c)传入的参数中， 第一个永远是"self", 代表着创建实例的本身；因此，在__init__内部，就可以把剩下的属性绑定在self(实例)上面<br>
(e) 有了__init__的方法，在通过类创建实例时，比如 student(实例) = Student()(类)，此时，类名后面跟的括号不能为空，必须与__init__中规定传入的参数匹配<br>
(f) __init__后面跟着的参数传入中，可以跟着 *args(可变参数) 和 **kw (关键字参数)<br>
(g) 如果为了让内部的属性不被外部访问，可以把属性的名称前面加上两个下划线，就变成了私有变量，比如说 self.__name 或者 self.__score
(h) 这时候为了获取私有变量，就要增加get 和 set 方法
</p>


    
    class Student(object)

      def __init__(self,name,score):   # 其实这么看来，__init__在python中的作用就是：“给类提供一个传入参数的入口”
        self.name = name
        self.score = score
      
      def print_score(self):
        print "%s : %s" %（self.name, self.score）
        
        
        
    class Student(object) 

      def __init__(self,name,score):  
        self.__name = name
        self.__score = score
        
      def get_name(self):
        return self.__name
        
      def get_score(self):
        return self.__score

<p align = 'left'>
(j) 在变量私有化的情况下，不允许外部代码修改score, 这时候可以增加set_score的方法<br> 
    
  
    class Student(object) 

      def __init__(self,name,score):  
        self.__name = name
        self.__score = score
        
      def get_name(self):
        return self.__name
        
      def get_score(self):
        return self.__score
  
      def set_score(self,score):
         self.__score = score
    
### 上述参考来源： https://blog.csdn.net/CLHugh/article/details/75000104
  
  
  

    class Graph:
 
      def __init__(self, row, col, graph):   # 
          self.ROW = row
          self.COL = col
          self.graph = graph
 
    # A utility function to do DFS for a 2D
    # boolean matrix. It only considers
    # the 8 neighbours as adjacent vertices
      def DFS(self, i, j):
          if i < 0 or i >= len(self.graph) or j < 0 or j >= len(self.graph[0]) or self.graph[i][j] != 1:
              return
 
        # mark it as visited
          self.graph[i][j] = -1
 
        # Recur for 8 neighbours
          self.DFS(i - 1, j - 1)
          self.DFS(i - 1, j)
          self.DFS(i - 1, j + 1)
          self.DFS(i, j - 1)
          self.DFS(i, j + 1)
          self.DFS(i + 1, j - 1)
          self.DFS(i + 1, j)
          self.DFS(i + 1, j + 1)
 
    # The main function that returns
    # count of islands in a given boolean
    # 2D matrix
dfdfdfdfd

