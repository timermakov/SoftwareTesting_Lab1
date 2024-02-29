import numpy as np
import matplotlib.pyplot as plt

# Значения X функции лежат в интервале от -1 до 1
x = np.linspace(-1, 1, 1000)

# График функции arcsin(x)
plt.plot(x, np.arcsin(x))

# Квадранты
plt.fill_between([-1, -0.5], -np.pi/2, -np.pi/6, facecolor='red', alpha=0.4)
plt.fill_between([-0.5, 0], -np.pi/6, 0, facecolor='blue', alpha=0.4)
plt.fill_between([0, 0.5], 0, np.pi/6, facecolor='green', alpha=0.4)
plt.fill_between([0.5, 1], np.pi/6, np.pi/2, facecolor='yellow', alpha=0.4)

# Равномерно распределённые по оси X точки на графике функции
for i in np.linspace(-1, 1, 17):
    plt.plot(i, np.arcsin(i), 'o', markersize=5, color='black')

# Пограничные значения в точках соприкосновения квадрантов
plt.plot([-1, -0.5, 0, 0.5, 1], [-np.pi/2, -np.pi/6, 0, np.pi/6, np.pi/2], 'o', markersize=10, color='violet')

# Сам график
plt.xlabel('x')
plt.ylabel('arcsin(x)')
plt.title('График функции arcsin(x) - эквивалентное разбиение')
plt.show()
