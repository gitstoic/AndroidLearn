package com.example.androidlearn

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidlearn.adapter.TopicAdapter
import com.example.androidlearn.data.DataSource
import com.example.androidlearn.databinding.FragmentTopicBinding


class TopicFragment : Fragment() {

    private var isGridLayoutManager = true
    private val myDataset = DataSource().loadTopics()
    private var _binding: FragmentTopicBinding? = null
    private val binding get() = _binding
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTopicBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding?.recyclerView!!
        chooseLayout()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu, menu)

        val layoutButton = menu?.findItem(R.id.action_switch)
        setIcon(layoutButton)
    }

    private fun chooseLayout() {
        if (isGridLayoutManager) {
            recyclerView.layoutManager = GridLayoutManager(context, 1)
        } else {
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        }
        recyclerView.adapter = TopicAdapter(myDataset, topicClicked = {
            val directions = TopicFragmentDirections.actionTopicFragment2ToDetailFragment(it)
            findNavController().navigate(directions)
        })
    }

    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null) return
        menuItem.icon =
            if (isGridLayoutManager)
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_grid)
            else
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_staggered_grid)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch -> {
                isGridLayoutManager = !isGridLayoutManager
                chooseLayout()
                setIcon(item)
                return true
            }
            R.id.contact_us->{
                view?.let { Navigation.findNavController(it).navigate(R.id.action_topicFragment2_to_contactFragment) };
                return true
            }
            R.id.about_us->{
                view?.let { Navigation.findNavController(it).navigate(R.id.action_topicFragment2_to_aboutFragment) };
                return true
            }



            else -> super.onOptionsItemSelected(item)
        }
    }
    }



