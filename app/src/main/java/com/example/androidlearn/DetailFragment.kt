package com.example.androidlearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.androidlearn.R
import com.example.androidlearn.databinding.FragmentDetail2Binding


class DetailFragment : Fragment()  {
    private var _binding: FragmentDetail2Binding? = null
    private val binding get() = _binding
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        _binding = FragmentDetail2Binding.inflate(inflater, container, false)
        return binding?.root!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val aboutTopics = args.aboutTopics
        binding?.detailTopic?.text = aboutTopics.topicName
        binding?.topicDesc?.text  = aboutTopics.topicDetails
        binding?.detailImage!!.setImageResource(aboutTopics.topicImage)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}