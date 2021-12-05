package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var q1 = QuestionData(
            question ="What is the capital of India?",
            id =1,
            option_one="Lucknow",
            option_two="Raipur",
            option_three= "New Delhi",
            option_four="Chennai",
            correct_ans= 3
        )
        var q2=QuestionData(
            question="Who was the first Indian woman in space?",
            id =2,
            option_one= "Sunita Williams",
            option_two = "Kalpana Chawla",
            option_three = "Koneru Humpy",
            option_four = "None of the above",
            correct_ans = 2
        )
        var q3=QuestionData(
            question = "India has largest deposists of _________ in the world ",
            id = 3,
            option_one = "Gold",
            option_two = "Copper",
            option_three = "Mica",
            option_four = "Platinum",
            correct_ans = 3
        )
        var q4=QuestionData(
            question = "Who was known as Iron Man of India?",
            id = 4,
            option_one = "Jawarlal Nehru",
            option_two = "Mahatma Gandhi",
            option_three = "Bhagat Singh",
            option_four = "Sardar Vallabhai Patel",
            correct_ans = 4
        )
        var q5=QuestionData(
            question = "The Indian to beat the computers in mathematicial wizardry is ",
            id = 5,
            option_one = "Shakunthala Devi",
            option_two = "Raja Ramana",
            option_three = "Ramunjan",
            option_four = "Rina Pinagarhi",
            correct_ans = 1
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}