fun main(args: Array<String>) {
    var stories=Story("caucasian",234,"german king",17)
    println(stories.record())

    var storyteller1=Story.Storyteller("wendy","kikuyu")
    println(storyteller1.tellStory())

    var translator = Story.Translator()
    println(translator.translate("kikuyu"))


}
//1. **Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance might come into play if there are different types of
//stories or storytellers.
class Story(var title: String, var length:Int,var lesson:String,var ageGroup:Int){
    fun record():String{
        return "the story $title is $length pages,it talks about $lesson and it is for people of the age $ageGroup"


    }

    class Storyteller (var name:String,var language:String) {
        fun tellStory(): String {
            return "today our storyteller is $name and she speaks $language , she is going to tell this type of story "

        }
    }
        class Translator {
            fun translate(targetLanguage: String):String{
                return "story is  translated in $targetLanguage"

            }
        }

}
//2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
