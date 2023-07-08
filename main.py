

def main():
  user={
    "user_info": [input("Welcome to our Apple Nutrition checker app, lets get you started by getting to know your Name: "),input("Gender: "),int(input("Age ")),int(input("Weight(kg): "))],
    "user_nutri":[ int(input("Daily Calorie Goal(kcal): ")),int(input("Daily Protein Goal(g): ")),int(input("Daily Fat Budget(g): ")),int(input("Is your goal a calorie Surplus or Deficit"))]
  }
  #exercise / hour
  exercise={
    "sleeping":60,
    "eating":90,
    "standing":100,
    "driving":110,
    "housework":140,
    "walking":180,
    "dancing":220,
    "running": 320,
    "aerobics": 420,
    "cycling": 560,
    "lifting": 520,
    "tenis": 470,
    "swimming": 620,
    "jogging": 700,
    "basketball": 600,
    
  
  
  }
  #serving size 100g
  fruit={
    "apple":[130,1,0],
    "banana":[105,1,0],
    "orange":[35,1,0],
    "pear":[100,1,0],
    "peach":[69,2,0],
    "grapefruit":[52,1,0],
    "apricot":[17,0,0],
    "passion_fruit":[19,0,0],
    "cherry":[130,1,0],
    "strawberry":[32,1,3],
    "mango":[65,1,0],
    "pineapple":[278,5,1]
  }
  hi_pro={
    "beef":[127,20,10],
    "chicken":[120,26,2],
    "salmon":[180,20,10],
    "tuna":[100,13,6],
    "cottage cheese":[90,13,1],
    "greek yogurt":[101,5,3],
    "cheese":[110,8,10],
    "egg":[70,6,5],
    "beans":[157,4,9],
    "milk":[130,8,5],
  }

  
  
 
  
  
      
  cal_in=0
  pro_in=0
  fat_in=0
  #Input calories intake
  for x in range(int(input("How many types of food have you eaten?\n"))):
    inc=input("What food have you eaten? \n")
    if inc.lower() in fruit or hi_pro:
      count=int(input("How many serving of "+inc+" have you eaten? "))
      if inc.lower() in fruit:
        
        cal_in+= (fruit[inc][0]*count)
        pro_in+= (fruit[inc][1]*count)
        fat_in+= (fruit[inc][2]*count)
      elif inc.lower() in hi_pro:
        cal_in+= (hi_pro[inc][0]*count)
        pro_in+= (hi_pro[inc][1]*count)
        fat_in+= (hi_pro[inc][2]*count)
      else:
       print("Our app does not have database for such food.")
  print("Total calories intake: "+str(cal_in)+"\nTotal protein intake: "+str(pro_in)+"\nTotal fat intake: "+str(fat_in))
  
  cal_burn=0
  #Input activity to burn calories
  for x in range(int(input("How many activities have you done?\n"))):
    inp=input("What activities have you accomplished? \n")
    if inp.lower() in exercise:
      cal_burn+= (exercise[inp]*int(input("How much hours did you do that activity? \n")))
    else:
     print("Our app does not have database for such activity.")
  print("Total calories burned: "+str(cal_burn))
  
  # caloriesmeter and determine if the user havent meet their calorie goals
  if cal_in>cal_burn:
    if (user["user_nutri"][3]).lower()!="surplus":
      print("Warning. You are currently in a calorie surplus of "+str(cal_in-cal_burn)+" calories")
      
    else:
      print("Fantastic. You are currently in a calorie surplus of "+str(cal_in-cal_burn)+" calories")
  elif cal_in<cal_burn:
    if (user["user_nutri"][3]).lower()=="surplus":
     print("Warning. You are currently in a calorie deficit of "+str(cal_in-cal_burn)+" calories")
    else:
      print("Fantastic. You are currently in a calorie deficit of "+str(cal_in-cal_burn)+" calories")
    
  
  
    
    
 
  
    
  
    
  

  
  
    
    
  
  
  
  
  
    
  
main()