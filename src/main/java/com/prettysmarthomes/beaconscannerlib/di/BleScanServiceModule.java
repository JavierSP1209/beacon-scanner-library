package com.prettysmarthomes.beaconscannerlib.di;

import android.bluetooth.BluetoothAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * Base module for BLeScanService
 */
@Module(includes = BleScanServiceBaseModule.class)
public final class BleScanServiceModule {

  @Provides
  static BluetoothAdapter providesBluetoothAdapter() {
    return BluetoothAdapter.getDefaultAdapter();
  }
}
