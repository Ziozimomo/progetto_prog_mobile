package com.example.italian_englishgames.memory;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.italian_englishgames.R;

public class MemWinFragmentDirections {
  private MemWinFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMemWinFragmentToMemGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_memWinFragment_to_memGameFragment);
  }

  @NonNull
  public static NavDirections actionMemWinFragmentToMemMenuFragment() {
    return new ActionOnlyNavDirections(R.id.action_memWinFragment_to_memMenuFragment);
  }
}