import io



file = io.open('a.txt', 'r')

streets = {}
intersections = {}
cars = []
semaphores = {}

lines = file.readlines()
duration, intersections_num, streets_num, car_num, score = lines.pop(0).split(
    ' '
)
duration = int(duration)

intersections_num = int(intersections_num)

streets_num = int(streets_num)

car_num = int(car_num)

score = int(score)


for x in lines[:streets_num]:
    start, end, name, length = x[:-1].split(' ')
    streets[name] = {
        'name': name,
        'end': end,
        'start': start,
        'length': length
    }
    # parse input
    inter = intersections.get(start, {})
    inputs = inter.get('input', set())
    inputs.add(name)
    inter['input'] = inputs
    intersections[start] = inter

    # parse output
    inter = intersections.get(end, {})
    inputs = inter.get('output', set())
    inputs.add(name)
    inter['output'] = inputs
    intersections[end] = inter

for x in lines[streets_num:]:
    car_streets = x[:-1].split(' ')
    car_streets = car_streets[1:]
    cars.append(
        {
            'streets': car_streets,
            'bonus_score': score,
        }
    )

print(len(streets))
print(streets)
print(len(intersections))
print(intersections)
print(len(cars))
print(cars)
print(len(semaphores))
print(semaphores)
