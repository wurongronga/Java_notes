# Stream

``` Java
list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
```

- "::" opperator: The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly. `<Class name>::<method name>`

## 1.2 stream的生成方式

stream结构

- 生成流
  - 通过数据源（数组、集合等）生成流
  - list.stream()
- 中间操作
  - 一个流后可跟随零个或多个中间操作，其目的主要是打开流，做出某种过滤/映射，然后返回一个新的流叫啊给下一个操作
  - 终结操作
    - 一个流只能有一个终结操作，当执行这个后，stream就被使用光了，因此无法继续使用

stream流的常见生成方式  

- collection can use the default method stream() `defaultStream<E> stream()`
- Map体系的集合间接的生成流
- 数组可以通过Stream借口的静态方法of(T...values)生成流
