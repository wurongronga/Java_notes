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
  - `Stream<String> listStream = llist.stream()`
- Map体系的集合间接的生成流 
  - `Map<String, Integer> map = new HashMap<String,Integer>()`
  - map.keySet().stream(): 键对应的流 `Stream<String> = map.keySet().stream()`
  - map.values().stream(): 值对应的流 `Stream<Integer> = map.values().stream()`
  - map.entrySet().stream(): 键值对对应的流 `Stream<Map.Entry<String,Integer>> = map.entrySet().stream()`
- 数组可以通过Stream借口的静态方法of(T...values)生成流
  - `String[] strArray = {"hello","world","java"}`
  - `Stream<String> strArrayStream = Stream.of(strArray)`
  - `Stream<String> strArrayStream2 = Stream.of("hello","world","java")`

## 1.3 stream中间流操作  

- `Stream<T> filter(Predicate predicate)`: Predicate 接口中的方法 - boolean test(T t) 对制定参数进行判断，返回一个布尔值
- `Stream<T> limit(long maxSize)`: 返回此流中的元素组成的流，节去前制定参数个数的数据
- `Stream<T> skip(long n)`: 跳过置顶参数个数的数据，返回由该流的剩余元素组成的流
- `Static<T> Stream<T> concat(Stream a, Stream b)`: 合并a和b两个流
- `Stream<T> distinct()`: 返回由该流的不同元素组成的流 （根据Objectequals(Object)）组成的流
- `Stream<T> sorted()`: 返回由此流的元素组成的流，根据自然顺序排序
- `Stream<T> sorted(Comparator comparator)`: 返回由该流的元素组成的流，根据comparator进行排序

