




import sys
import random


def main():
    points = 0
    live = 1
    invent = []
    allies = []
    exe = input("Welcome to The 좀비 종말, type play to play,exit to exit.You can always exit the game by typing quit. ")
    while live != 0:
        if exe.lower() == "play":
            print("*-*-*")
            print("*-*")
            print("*-*-*")

            print("******* BACKGROUND *******")
            print(
                "Its 2022 in Busan, a contagious virus called COVID-19 mutated to affect people, causing them to die "
                "and turn into zombie-like superhumans. The infected tends to bite the unaffected individuals to "
                "spread the virus. ")
            print(
                "Objective: To reunite with your daughter in Seoul and gain as much points as possible OR find a cure for the disease")

            print("******* BLACKGROUND *******")


            a = "Huy Huynh, perks: Muscular "
            b = "Bradley Tarver, perks:Speed"
            c = "Trina Nguyen, perks: Smart"
            print("a. " + a)
            print("b. " + b)
            print("c. " + c)
            print("*-*-*")
            print("*-*")
            print("*-*-*")
            res = input("Please select your characte by typing in the letter of the charracter: ")
            if res == "a":
                print("******* PRESENT *******")
                print(
                    "Hello Huy Huynh, you are now on a KTX to Seoul where it has successfully quarantined from the pandemic. But on this train, you are not sure if there is anyone infected or not")
            elif res == "b":
                print("******* PRESENT *******")
                print(
                    "Hello Bradley Tarver, you are now on a KTX to Seoul where it has successfully quarantined from the pandemic. But on this train, you are not sure if there is anyone infected or not")
            elif res == "c":
                print("******* PRESENT *******")
                print(
                    "Hello Trina Nguyen, you are now on a KTX to Seoul where it has successfully quarantined from the pandemic. But on this train, you are not sure if there is anyone infected or not")
            elif res == "quit":
                sys.exit("******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                    points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
            print()
            res1 = input("The train is departuring, would you like to stay or leave ? ")
            print()

            if res1.lower() == "stay":
                print(
                    "Looking through the window, the zombies horde is eating human flesh in the train station screaming for help. You made a great decision, +10 points!")
                points += 10
                print("Current points: " + str(points))


                print(
                    "I sighed from relive as the train left and seated myself at section 12 of the KTX which is the last section. ")
                print("*-*-*")
                print("*-*")
                print("*-*-*")
                print(
                    "The scene of the city horrified me, corpse everywhere, fire and smoke from buildings, helicopters and tank were mobilized in an attempt to stop the virus but it seems to make it worse. A broadcast said that almost every state of Korea have been affected except for Seoul.Giving me more hope for the journey ahead. In the mist of chaos, I dont have anything with me")

                d = "First aid kit(plus 1 more live)"
                e = "Baseball Bat(increase offense and defense)"
                f = "Flashlight(vision at night, 1 time use)"
                print("*-*-*")
                print("*-*")
                print("*-*-*")
                print("d. " + d)
                print("e " + e)
                print("f " + f)

                res2 = input("Looking around, there are 3 available objects that i can use but i can only choose 1")
                if res2 == "d":
                    invent.append("First aid kit")
                    print("Inventory item added: " + d)
                    live += 1
                    print("Current health: " + str(live))
                elif res2 == "e":
                    invent.append("baseball bat")
                    print("Inventory item added: " + e)
                elif res2 == "f":
                    invent.append("flashlight")
                    print("Inventory item added: " + f)
                elif res2 == "quit":
                    sys.exit(
                        "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                            points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                print("*-*-*")
                print("*-*")
                print("*-*-*")
                g = "a old granny, skill: unknown ??"
                h = "a teenage boy with a baseball bat,skill battle side by side"
                i = "a german shepperd dog,skill protects you from fatal deaths"
                print("g. " + g)
                print("h " + h)
                print("i " + i)
                res3 = input(
                    "Its better to go on this journey with an ally to have each other backs. As i look around, there is 3 pottential allies(pick only 1): ")
                if res3 == "g":
                    allies.append("g")
                    print("allies added: " + g)
                elif res3 == "h":
                    allies.append("h")
                    print("allies added: " + h)
                elif res3 == "i":
                    allies.append("i")
                    print("allies added: " + i)

                elif res3 == "quit":
                    sys.exit(
                        "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                            points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                print("*-*-*")
                print("*-*")
                print("*-*-*")
                res4 = input(
                    "******SITUATION******\nWhile you are trying to get to know your new ally, i witnessed the scene of horros as a zombie bite the neck of a passenger. We shut the door for safety, there are still people that hasnt been infected, would you open it or close: ")
                if res4.lower() == "open":
                    if res2 == "d":

                        print("As i opened the door, a zombie rushed and bited my neck.")

                        live -= 1
                        points += 20
                        print(
                            "But luckily i have the first aid kit that successfully stop the contagious bacteria and save more survivors ! Great job +20 points, current points: " + str(
                                points))
                    elif res2 == "f":
                        sys.exit(
                            "As i opened the door, a zombie rushed towards me and bite my neck.******FATALITY******\nYour journey has ended due to infection or exit game,points: " + str(
                                points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")

                    elif res2=="e":
                        print("As i open the door, a zombie rushed towards me but luckily i used my baseball bat to hit it,+10 points")
                        points+=10
                        print("Points: "+str(points))
                    elif res2=="quit":
                        sys.exit(
                            "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")








                elif res4.lower() == "close":
                    print("Great job, you successfully quaratined from the zombies, +10 points.")
                    points += 10
                    print("Current points: " + str(points))
                elif res4.lower() == "quit":
                    sys.exit(
                        "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                            points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                print("*-*-*")
                print("*-*")
                print("*-*-*")
                print(
                    "Now we wait for the train to arrive to Incheon for a refuel stop. There was rumor that Incheon has successfully been quarantined and it is safe to go. Only I, the train operator and my ally successfully exit out of the train.")
                print()
                if res2 == "e":
                    points += 10
                    print(
                        "We headed for the main square to fuel the train. My decision of choosing the Baseball Bat was great because i can defend myself and my ally here, bonus points +10 for protecting ally successfully, current points: " + str(
                            points))
                elif res2 != "e":
                    if res3 == "h":
                        points += 10
                        print(
                            "We headed for the main square to fuel the train. My decision of choosing that kid was great because we successfully defend each other backs, bonus points +10 for protecting ally successfully, current points: " + str(
                                points))
                    elif res3 == "i":
                        print(
                            "We headed for the main square to fuel the train. The onyl reason i am here right now is thank to that dog, who sacrificed himself for me on the way")
                        allies.remove("i")
                        points -= 10
                        print("Points: " + str(points))

                    elif res3 == "g":
                        points -= 10
                        print(
                            "We headed for the main square to fuel the train. The onyl reason i am here right now is thank to that poor granny, who sacrificed herself for me on the way. Unable to protect ally, -10 points current points: " + str(
                                points))
                        allies.remove("g")

                        print("Points: " + str(points))
                print("*-*-*")
                print("*-*")
                print("*-*-*")
                res5 = input(
                    "When finished fueling, the zombie swarms blocked the exit to our next train, now there is 2 path that we can take. On my left is the B hall, which would take longer to get to the train but it seems less dangerous than C hall. On my right is the C hall, is faster to get to the train but it seem suspicous cause there was left over guns, SWAT shields left over on the floor, which direction should i go ?")
                if res5.lower() == "left":
                    points += 10
                    print(
                        "My instincts was correct, there was no zombies in this path, while i look back, a swarm of zombies overcrowded C hall,and we successfully got on the train to Seoul on my way to meet my daughter. ")
                    print("Points " + str(points))


                elif res5.lower() == "right":
                    print(
                        "My instincts have failed me, as we were overunned by the hoarde of zombies which is too much to handle. We both got feasted by the zombies and ill never get to see my daughter again.The end")
                    sys.exit(
                        "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                            points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                elif res5 == "quit":
                    sys.exit(
                        "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                            points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                print()
                if res3 == "g":
                    print(
                        "As we are on the train, the granny told me that she is the cure for this disease. I was amazed and didnt believe what she said, she showed me a file of the Korean Health and Science institue examining this disease on her, and she had the AB blood type which is can cure the disease. As for more insights of how this happened, she told me that this bio-tech weapon was first created mainly for the purpose of gaining bio-tech weapons to start another world war 3 against US, but the virus got out of hand and start infecting everyone. To stop this pandemic, i have to deliver her to the nearest science facility to extract blood and create a vaccine for the sacre of the world.")
                    print(
                        "Choices:\n1.Risk your life to make a cure out of the granny in Cheongjang, which is not near Seoul\n2.Go to seoul to meet your daughter, which is the objective of your life")
                    res6 = input("The world fate lies in your hands.1 or 2")
                    if res6 == "1":
                        print(
                            "The fate of the world is more important than my daughter, i decided to reroute to Choengjang to make the cure. Information about Cheongjang was misty, so its uncertain if its safe or not.\n5 hours later, we have arrived at Science institute of Cheongjang where we believed that we can extract granny's blood and create the vacine. The facility seemingly looks okay, we headed for the main entrance where there is more item to choose from")
                        x = "entrance card"
                        y = "first aid kit"
                        z = "a flare gun"
                        print("x. " + str(x))
                        print("y. " + str(y))
                        print("z. " + str(z))
                        res7 = input("Choose 1: ")
                        if res7.lower() == "x":
                            invent.append("entrance card")
                            print("Items in inventory: " + str(invent))
                        elif res7.lower() == "y":
                            invent.append("first aid kit")
                            print("Items in inventory: " + str(invent))
                            live += 1
                        elif res7.lower() == "z":
                            invent.append("Flare gun")
                            print("Items in inventory: " + str(invent))
                        elif res7.lower() == "quit":
                            sys.exit(
                                "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                    points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                        print("*-*-*")
                        print("*-*")
                        print("*-*-*")

                        res8 = input(
                            "There was not a single soul in this facility, but granny forgot the way to the blood lab. There is 3 possible paths, straight ahead or left or right")
                        if res2.lower()=="f":
                          if res8.lower() == "straight":
                            if res7.lower() == "z":
                                points += 10

                                print(
                                    "We encountered a horde of zombies and was surrounded by zombies as we made noises. As i tried to pulling everything out of my backpack that possibly could help the situation, i had a flare gun, i shot it at the hoarde and unexpectedly they got stun and they screamed in pain, as if they were vulnerable to heat")
                                print("Points: " + str(points))
                                sys.exit(
                                    "But sadly its a dead end, i failed to achieve my mission.******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                        points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                            else:
                                print(
                                    "There is no way we could get out of this. Damn, i should have been with my daughter right now. The end")
                                sys.exit(
                                    "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                        points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                        elif res8.lower() == "right":
                          if res7.lower() == "x":

                                print(
                                    "Our instincts saved us, there is the lab right infront of us. And my decision to choose the card was time saving, but there is a problem,it also needs a password for the pin numbers. Its a 4 digit password. And be careful it will only let 4 tries, when exceded number of tries it will terminate access to the lab")
                                count = 1

                                sec = list(random.sample(range(1, 9), 4))
                                print(sec)
                                inp = []
                                for x in range(4):
                                    inp.append(int(input("Input " + str(x) + "st number: ")))
                                    print(inp)
                                comp = [x for x in inp if x in sec]
                                for x in range(len(inp)):
                                    for y in range(len(sec)):
                                        if inp[x] == sec[y]:
                                            if x == y:
                                                print("Correct indexes: " + str(x))

                                print("Numbers correct: " + str(len(comp)) + "\nTries left: " + str(4 - count))

                                if len(comp) == 4:

                                    print("Nice job it took " + str(count) + " tries")
                                while len(comp) != 4 and count != 4:
                                    inp.clear()
                                    for x in range(4):
                                        inp.append(int(input("Input " + str(x) + "st number: ")))
                                        print(inp)
                                    comp = [x for x in inp if x in sec]
                                    for x in range(len(inp)):
                                        for y in range(len(sec)):
                                            if inp[x] == sec[y]:
                                                if x == y:
                                                    print("Correct indexes " + str(x))
                                    count += 1
                                    print("Numbers correct: " + str(len(comp)) + "\nTries left: " + str(4 - count))
                                    if len(comp) == 4:

                                        print("Nice job it took " + str(count) + " tries")
                                    elif len(comp)!=4:
                                        sys.exit(
                                            "It took more than 4 tries to open the door, mission failed.\n******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                                points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialouge writer\nTrina Nguyen, Script writer")


                        elif res8.lower()=="left":
                          sys.exit(
                                "Its a dead end full of debris and the hoarde of zombie is behind us when the granny "
                                "accidentally drops her walker. The end ******FATALITY******\n""Your journey has "
                                "ended due to infection or exit game,points: " + str(
                                    points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                        elif res8.lower()=="left":
                          if res7.lower()!="f":
                            sys.exit("The left path was covered in darkness, i only wished i could have take that flashlight, unable to complete mission.\n******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                    points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                        print("*-*-*")
                        print("*-*")
                        print("*-*-*")
                        print("*****CHECKPOINT******\nYou are 2/3 on your journey to make the vaccine and reunite with your daughter\nPoints: "+str(points)+"\nBackpack: "+str(invent)+"\nNow you are in the lab that will either save humanity or end it. But all your hopes dissapeared when granny got tripped over debris and fell into a edge rock that made her head bleeds .\nI can only collect the blood into the jar dripping from her head into the jar and make the vaccine")
                        print("Given the background as a hematologist, i knew which machine i have to choose to extract vaccine that have immune cells out of the blood\nBut there is a tiny problem")
                        li=["A","T","C","A","G","C","T"]
                        print(li)
                        res9=[]
                        top=0
                        for x in range(len(li)):
                         res9.append(input("Im given a sequence of complementary sequence basing of the blood, my job is to write the corresponding sequence for each base and IT ONLY ACCEPT 1 TRY"))
                        for x in range(len(res9)):
                            if li[x]=="A":
                                if res9[x].upper()=="T":
                                    top+=1
                            elif li[x] == "T":
                                if res9[x].upper() == "A":
                                    top+=1
                            elif li[x] == "C":
                                if res9[x].upper() == "G":
                                    top+=1
                            elif li[x] == "G":
                                if res9[x].upper() == "C":
                                    top+=1
                        if res9=="quit":
                            sys.exit(
                                ("\n******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                    points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer"))

                        if top<7:
                            sys.exit("It took more than 1 tries to open the door, mission failed.\n******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                    points) + " good luck next time")
                        elif top==7:
                            print("Good job!, +30 points\n points: "+str(points)+", now you have successfully created the vaccine. The question here is how to deliver it to the outer world ?")
                            print("*-*-*")
                            print("*-*")
                            print("*-*-*")
                            res10=input("Now there is two choices since the zombies have surrounded the lab and there is no way out of the lab.\n1.To inject the vaccine despite the effective of the vaccine\n2. To patiently wait for military aid")
                            if res10=="1":
                                points+=30
                                print("I took a deep breathe and injected the vaccine and opened the door. I thought i was dead but the zombie rushed in the lab although i was infront of them. I punched one zombie in the face, it didnt flinch.\n*****MISSION COMPLETE****")
                                sys.exit("Marvelous job completing the game.Points: "+str(points) +"Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer ")
                            elif res10=="2":
                                sys.exit(
                                    "You died because of lack of food and drink\n******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                        points) + " good luck next time.Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")












                    elif res6 == "2":
                        print(
                            "My daughter is the deerest thing to me i have lost so much love ones, she is the only thing that makes my life meaningful. ")
                        sys.exit(
                            "Good job you have reunited with your dear daughter, but everyone got infected the next day because you failed to invent the vaccine\n *****GOOD ENDING*****, points: " + str(
                                points)+" Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                    elif res6=="quit":
                        sys.exit(
                            "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                points) + " good luck next time.Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
                else:
                    sys.exit(
                            "Good job you have reunited with your dear daughter, but everyone got infected the next day because you failed to invent the vaccine\n *****GOOD ENDING*****, points: " + str(
                                points)+" Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
            elif res1.lower() == "leave":
                print(
                            "The moment I leave the train, the station was packed of people back to back. The second I walk off the train, I see a crowd of people screaming and a crowd running from an area. I hear gunshots and screams,  as the someone is being eaten alive. You turn around and see more people running towards you, by the tracks. Zombies are surrounding you, and you fall onto the tracks. I shout as the zombies stand over me and bite into my tender flesh. The End")

                sys.exit(
                            "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                points) + " good luck next time.Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")

            elif res1 == "quit":
                sys.exit(
                            "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                                points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")
        elif exe.lower() == "quit":
            sys.exit(
                "******FATALITY******\n""Your journey has ended due to infection or exit game,points: " + str(
                points) + " good luck next time Thank you for playing our 좀비 종말 game made by\nHuy Huynh, Director\nBradley Tarver, Dialogue producer\nTrina Nguyen, Story writer")

main()






































































