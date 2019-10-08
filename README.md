# aliyun-odps-udf-simple


// @Resolve("string->array<string>")

目前支持的类型有：
1. 自定义函数（UDF/UDAF/UDTF）、

  - UDF (User Defined Scalar Function) 用户自定义标量值函数（User Defined Scalar Function）。其输入与输出是一对一的关系，即读入一行数据，写出一条输出值 。
  - UDTF (User Defined Table Valued Function) 自定义表值函数。用来解决一次函数调用输出多行数据场景。它是唯一能够返回多个字段的自定义函数，而UDF只能一次计算输出一条返回值。
  - UDAF（User Defined Aggregation Function） 自定义聚合函数。其输入与输出是多对一的关系， 即将多条输入记录聚合成一条输出值。它可以与SQL中的GROUP BY语句联用。具体语法请参见聚合函数
  
2. MapReduce（Driver/Mapper/Reducer）、
3. 非结构化开发（StorageHandler/Extractor）等。

