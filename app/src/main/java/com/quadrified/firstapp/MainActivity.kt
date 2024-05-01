package com.quadrified.firstapp

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quadrified.firstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var receiver: AirplaneModeChangedReceiver

    private val CHANNEL_ID = "myChannelID"
    private val CHANNEL_NAME = "myNotificationChannel"
    private val NOTIFICATION_ID = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        enableEdgeToEdge()
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        /**
         * Buttons
         */
//        binding.btnApply.setOnClickListener {
//            val firstName = binding.etFirstName.text.toString()
//            val lastName = binding.etLastName.text.toString()
//            val birthDate = binding.etBirthDate.text.toString()
//            val country = binding.etCountry.text.toString()
//
//            Log.d("MainActivity", "$firstName, $lastName, $birthDate, $country")
//
//        }

        /**
         * TextViews
         */
//        var count = 0
//        binding.btnCount.setOnClickListener {
//            count++
//            binding.tvCounter.text = "Let's count together: $count"
//        }

        /**
         * EditTexts
         */
//        binding.btnAdd.setOnClickListener {
//            binding.tvResult.text = (binding.etFirstNumber.text.toString()
//                .toInt() + binding.etSecondNumber.text.toString().toInt()).toString()
//        }

        /**
         * ImageViews
         */
//        binding.btnShowImage.setOnClickListener {
//            binding.ivProfileImage.setImageResource(R.drawable.profile)
//        }

        /**
         * Checkbox and Radio buttons
         */
//        binding.btnOrder.setOnClickListener {
//            val checkedMeatRadioButtonId = binding.rgMeatType.checkedRadioButtonId
//            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
//            val cheese = binding.cbCheese.isChecked
//            val onion = binding.cbOnion.isChecked
//            val salad = binding.cbSalad.isChecked
//
//            val finalOrder = "You ordered a burger with\n" +
//                    "${meat.text}" +
//                    (if (cheese) "\nCheese" else "") +
//                    (if (onion) "\nOnion" else "") +
//                    (if (salad) "\nSalad" else "")
//
//            binding.tvOrder.text = finalOrder
//
//        }

        /**
         * Toasts
         */
//        binding.btnShowToast.setOnClickListener {
//            Toast.makeText(this, "Hello Android, I'm a toast", Toast.LENGTH_LONG)
//                .show()
        // Custom toast
////            Toast(this).apply {
////                duration = Toast.LENGTH_LONG
////                view = layoutInflater.inflate(R.layout.custom_toast, R.layout.custom_toast)
////                show()
////            }
//        }

        /**
         * Navigation via Intents to open Second activity
         */
//        binding.btnOpenActivity.setOnClickListener {
//            Intent(this, SecondActivity::class.java).also {
//                startActivity(it)
//            }
//        }

        /**
         * Passing data b/w activities using Extras
         */
//        binding.btnApply.setOnClickListener {
//            val name = binding.etName.text.toString()
//            val age = binding.etAge.text.toString().toInt()
//            val country = binding.etCountry.text.toString()
//            val person = Person(name, age, country)
//
//            Intent(this, SecondActivity::class.java).also {
//                it.putExtra("EXTRA_PERSON", person)
//                //Without class
////                it.putExtra("EXTRA_NAME", name)
////                it.putExtra("EXTRA_AGE", age)
////                it.putExtra("EXTRA_COUNTRY", country)
//                startActivity(it)
//            }
//        }
        /**
         * Permissions request
         * TODO: Learn better
         */
//        binding.btnRequestPermissions.setOnClickListener {
//            requestPermissions()
//        }

        /**
         * Implicit intents to open a gallery app to access image
         */
//        binding.btnOpenGallery.setOnClickListener {
//            Intent(Intent.ACTION_GET_CONTENT).also {
//                it.type = "image/*" // mimeType
//                // TODO: Deprecated, learn new
//                startActivityForResult(it, 0)
//            }
//        }

        /**
         * Dialogs demo
         */

        // Normal Alert dialog
//        val addContactDialog = AlertDialog.Builder(this).setTitle("Add Contact")
//            .setMessage("Do you want to add this contact?").setIcon(R.drawable.ic_add_contact)
//            .setPositiveButton("Add Contact") { _, _ ->
//                Toast.makeText(this, "You added this contact", Toast.LENGTH_SHORT).show()
//            }.setNegativeButton("Cancel") { _, _ ->
//                Toast.makeText(this, "Did not add this contact", Toast.LENGTH_SHORT).show()
//            }.create()
//
//        binding.btnDialog1.setOnClickListener {
//            addContactDialog.show()
//        }
//
//        // Single Selection Dialog with Radio
//        val options = arrayOf("Option 1", "Option 2", "Option 3")
//        val singleChoiceDialog = AlertDialog.Builder(this).setTitle("Choose one of the following")
//            .setSingleChoiceItems(options, 0) { dialogInterface, i ->
//                Toast.makeText(this, "You selected ${options[i]} ", Toast.LENGTH_SHORT).show()
//            }.setPositiveButton("Done") { _, _ ->
//                Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
//            }.setNegativeButton("Cancel") { _, _ ->
//                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
//            }.create()
//
//        binding.btnDialog2.setOnClickListener {
//            singleChoiceDialog.show()
//        }
//
//        // Multiple Selection Dialog with Checkbox
//        val multiChoiceDialog =
//            AlertDialog.Builder(this).setTitle("Choose one of the following").setMultiChoiceItems(
//                options, booleanArrayOf(false, false, false)
//            ) { _, i, isChecked ->
//                if (isChecked) {
//                    Toast.makeText(this, "You checked ${options[i]} ", Toast.LENGTH_SHORT)
//                        .show()
//                } else {
//                    Toast.makeText(this, "You unchecked ${options[i]} ", Toast.LENGTH_SHORT)
//                        .show()
//                }
//            }.setPositiveButton("Done") { _, _ ->
//                Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
//            }.setNegativeButton("Cancel") { _, _ ->
//                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
//            }.create()
//
//        binding.btnDialog3.setOnClickListener {
//            multiChoiceDialog.show()
//        }

        /**
         * Spinner (Dropdown Menu)
         */

        // Custom adapter
//        val customList = listOf("First", "Second", "Third", "Fourth", "Fifth")
//        val adapter = ArrayAdapter<String>(
//            this,
//            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
//            customList
//        )
//        binding.spMonths.adapter = adapter
//
//        // Anonymous class
//        binding.spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                adapterView: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                Toast.makeText(
//                    this@MainActivity,
//                    "You selected ${adapterView?.getItemAtPosition(position).toString()}",
        //                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//
//        }

        /**
         * RecyclerView
         */
        // Step 1: Create RecyclerView in xml
        // Step 2: Create RecyclerView Item in xml
        // Step 3: Create Data class for RecyclerView Adapter in a data class
        // Step 4: Create RecyclerView Adapter in a Class
        // Step 5: Implement RecyclerView Adapter
        // Step 6: Implement RecyclerView Adapter in MainActivity
//
//
//        val todoList = mutableListOf(
//            Todo("Get Eggs", false),
//            Todo("Learn Android Development", true),
//            Todo("Practice More", false),
//            Todo("Eat breakfast", false),
//            Todo("Practice More Android", true)
//        )
//
//        val adapter = TodoAdapter(todoList)
//        binding.rvTodos.adapter = adapter
//        binding.rvTodos.layoutManager = LinearLayoutManager(this)
//
//        binding.btnAdd.setOnClickListener {
//            val title = binding.etTodo.text.toString()
//            if (title != "") {
//                val todo = Todo(title, false)
//                todoList.add(todo)
//                adapter.notifyItemInserted(todoList.size - 1)
//                binding.etTodo.text = null
//            } else {
//                Toast.makeText(this, "Enter your TODO", Toast.LENGTH_SHORT).show()
//            }
//        }

        /**
         * Fragments
         */

//        val firstFragment = FirstFragment()
//        val secondFragment = SecondFragment()
//
//        // Using FrameLayout (blocks a piece of space in layout) to replace Fragments dynamically, cannot otherwise
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment, firstFragment)
//            commit()
//        }
//
//        binding.btnFragment1.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment, firstFragment)
//                addToBackStack(null) // to add to backstack when pressed back
//                commit()
//            }
//        }
//
//        binding.btnFragment2.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment, secondFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }

        /**
         * Bottom Tab Navigation with Material Bottom Tab and Fragments
         */
        // Step 1: Create Menu resource directory in res
        // Step 2: Create bottom_nav_menu xml
        // Step 3: Create Menu with menu items and icons (add icons in drawable)
        // Step 4: Add FrameLayout to activity_main
        // Step 5: Add bottom navigation lib and pass bottom_nav_menu to menu
        // Step 6: Implement swapping of fragments

//        val firstFragment = FirstFragment()
//        val secondFragment = SecondFragment()
//        val thirdFragment = ThirdFragment()
//
//        setCurrentFragment(firstFragment);
//
//        binding.bottomNavigationView.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.miHome -> setCurrentFragment(firstFragment)
//                R.id.miMessages -> setCurrentFragment(secondFragment)
//                R.id.miProfile -> setCurrentFragment(thirdFragment)
//            }
//            true// no return true in lambda fn
//        }
//        Todo: Did not work,
//        val badge = binding.bottomNavigationView.getOrCreateBadge(R.id.miMessages)
//        badge.number = 10
//        badge.isVisible = true

        /**
         * Shared Preferences Demo
         */
//        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
//        val editor = sharedPref.edit()
//
//        binding.btnSave.setOnClickListener {
//            val name = binding.etName.text.toString()
//            val age = binding.etAge.text.toString().toInt()
//            val isAdult = binding.cbAdult.isChecked
//
//            editor.apply { // -> Kotlin scope fn
//                putString("name", name)
//                putInt("age", age)
//                putBoolean("isAdult", isAdult)
//                apply() // asynchronous
//            }
//        }
//
//        binding.btnLoad.setOnClickListener {
//            val name = sharedPref.getString("name", null)
//            val age = sharedPref.getInt("age", 0)
//            val isAdult = sharedPref.getBoolean("isAdult", false)
//
//            binding.etName.setText(name)
//            binding.etAge.setText(age.toString())
//            binding.cbAdult.isChecked = isAdult
//        }

        /**
         * Notifications Demo
         */

        // Globally define channel ID and Channel Name
        // Creating Notification Channel for OS > 8
//        createNotificationChannel()
//
//        // Pending Intents
//        val intent = Intent(this, MainActivity::class.java)
//        val pendingIntent = TaskStackBuilder.create(this).run {
//            addNextIntentWithParentStack(intent)
//            getPendingIntent(0, PendingIntent.FLAG_IMMUTABLE)
//        }
//
//        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
//            .setContentTitle("Awesome Notification Title")
//            .setContentText("THis is content text")
//            .setSmallIcon(R.drawable.ic_favourites)
//            .setPriority(NotificationCompat.PRIORITY_HIGH)
//            .setContentIntent(pendingIntent)
//            .build()
//
//        val notificationManager = NotificationManagerCompat.from(this)
//
//        binding.btnShowNotification.setOnClickListener {
//            // TODO: Does not work without giving permissions, need to learn
//            notificationManager.notify(NOTIFICATION_ID, notification)
//        }

        /**
         * Intent Services Demo
         * used for background work
         * Works on another thread
         * Cannot be used for Multi-threading
         * Stops automatically
         * Add to AndroidManifest.xml
         */
//
//        binding.btnStartService.setOnClickListener {
//            Intent(this, MyIntentService::class.java).also {
//                startService(it)
//                binding.tvServiceStatus.text = "Service Running"
//            }
//        }
//        binding.btnStopService.setOnClickListener {
//            MyIntentService.stopService()
//            binding.tvServiceStatus.text = "Service Stopped"
//        }

        /**
         * Service demo
         * runs on main thread
         * Need to Stop manually
         * Add to AndroidManifest.xml
         */

//        binding.btnStartService.setOnClickListener {
//            Intent(this, MyService::class.java).also {
//                startService(it)
//                binding.tvServiceStatus.text = "Service Running"
//            }
//        }
//
//        binding.btnStopService.setOnClickListener {
//            Intent(this, MyService::class.java).also {
//                stopService(it)
//                binding.tvServiceStatus.text = "Service Stopped"
//            }
//        }
//
//        binding.btnSendData.setOnClickListener {
//            Intent(this, MyService::class.java).also {
//                val dataString = binding.etData.text.toString()
//                it.putExtra("EXTRA_DATA", dataString)
//                startService(it)
//                binding.tvServiceStatus.text = "Service Running"
//            }
//        }

        /**
         * Broadcast Receivers
         * Used to respond to system wide events
         * Broadcast => system wide events like device started, sms received etc
         */
        receiver = AirplaneModeChangedReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }

    } // TODO: onCreate() ends

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }

    /**
     * Notifications Demo
     */
//    private fun createNotificationChannel() {
//        // Checking OS > 8
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val channel = NotificationChannel(
//                CHANNEL_ID,
//                CHANNEL_NAME,
//                NotificationManager.IMPORTANCE_DEFAULT
//            ).apply {
//                lightColor = Color.GREEN
//                enableLights(true)
//                enableVibration(true)
//            }
//
//            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//            manager.createNotificationChannel(channel)
//        }
//    }


    /**
     * Bottom Tab Navigation with Fragments
     */
//    private fun setCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment, fragment)
//            commit()
//        }


    /**
     * Permissions
     * Internet
     * Writing external storage
     * Location
     * Location Background
     */

    // Checking for permission
//    private fun hasWriteExternalStoragePermission() = ActivityCompat.checkSelfPermission(
//        this, Manifest.permission.WRITE_EXTERNAL_STORAGE
//    ) == PackageManager.PERMISSION_GRANTED

    // Foreground Location permission
//    private fun hasLocationForegroundPermission() = ActivityCompat.checkSelfPermission(
//        this, Manifest.permission.ACCESS_COARSE_LOCATION
//    ) == PackageManager.PERMISSION_GRANTED

    // Background Location permission
//    private fun hasLocationBackgroundPermission(): Boolean =
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            ActivityCompat.checkSelfPermission(
//                this, Manifest.permission.ACCESS_BACKGROUND_LOCATION
//            ) == PackageManager.PERMISSION_GRANTED
//        } else {
//            false
//        }
//
//    private fun requestPermissions() {
//        val permissionsToRequest = mutableListOf<String>()
//        if (!hasWriteExternalStoragePermission()) {
//            permissionsToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//        }
//        if (!hasLocationForegroundPermission()) {
//            permissionsToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)
//        }
//        if (!hasLocationBackgroundPermission()) {
//            permissionsToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
//        }
//
//        if (permissionsToRequest.isNotEmpty()) {
//            ActivityCompat.requestPermissions(this, permissionsToRequest.toTypedArray(), 0)
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == 0 && grantResults.isNotEmpty()) {
//            for (i in grantResults.indices) {
//                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
//                    Log.d("PermissionsRequest", "${permissions[i]} granted")
//                }
//            }
//        }
//    }

    /**
     * Implicit intents to open a gallery app to access image
     */
//    @Deprecated("Deprecated in Java")
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode === Activity.RESULT_OK && requestCode == 0) {
//            val uri = data?.data
////            binding.ivPhoto.setImageURI(uri)
//        }
//    }


    /**
     * Adding Toolbar menu => res > menu > app_bar_menu.xml
     */
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.app_bar_menu, menu)
//        return true
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.miAddContact -> Toast.makeText(this, "You tapped Add Contact", Toast.LENGTH_SHORT)
//                .show()
//
//            R.id.miFavourites -> Toast.makeText(this, "You tapped Favourites", Toast.LENGTH_SHORT)
//                .show()
//
//            R.id.miSettings -> Toast.makeText(this, "You tapped Settings", Toast.LENGTH_SHORT)
//                .show()
//
//            R.id.miFeedback -> Toast.makeText(this, "You tapped Feedback", Toast.LENGTH_SHORT)
//                .show()
//
//            R.id.miClose -> finish()
//        }
//        return true
//    }

}