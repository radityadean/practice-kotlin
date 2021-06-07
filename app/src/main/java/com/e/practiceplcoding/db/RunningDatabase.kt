package com.e.practiceplcoding.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    version = 1,
    entities = [Run::class],
    exportSchema = false
)

@TypeConverters(Converter::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO

}



//// example 1
//class MyActivity : AppCompatActivity() {
//
//    lateinit var roomDatabase: MyDatabase
//    lateinit var repository: MyRepository
//    lateinit var viewModel: MyViewModel
//    lateinit var viewModelFactory: MyViewModelFactory
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_my)
//
//        roomDatabase = MyDatabase.create(this)
//        repository = MyRepository(roomDatabase)
//        viewModelFactory = MyViewModelFactory(application, repository)
//        viewModel = ViewModelProvider(this, viewModelFactory)
//            .get(MyViewModel::class.java)
//    }
//}

//// example 2
//class MyActivity : AppCompatActivity() {
//    lateinit var viewModel: ViewModel
//
//    @Inject
//    lateinit var viewModelFactory : MyViewModelFactory
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_my)
//
//        viewModel = ViewModelProvider(this, viewModelFactory)
//            .get(MyViewModel::class.java)
//    }
//}

