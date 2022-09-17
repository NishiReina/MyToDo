package com.example.mytodo.page.create

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mytodo.MainViewModel
import com.example.mytodo.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateToDoFragment:Fragment(R.layout.create_todo_fragment) {
    private val vm: CreateToDoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_create, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}