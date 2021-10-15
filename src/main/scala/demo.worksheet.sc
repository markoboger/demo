1 + 4

val name = "Marko"
name
println(name)

def f(x: Int) = x + 1
f(8)

case class Person(name: String, age: Int)
val marko = Person("Marko", 52)
marko.name

def bar(cellWidth: Int = 3) = ("+" + "-" * cellWidth) * 3 + "+"
bar(5)

val game2 = """
+---+---+---+
|   |   |   |
+---+---+---+
"""
