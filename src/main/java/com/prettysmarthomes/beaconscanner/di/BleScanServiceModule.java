package com.prettysmarthomes.beaconscanner.di;

import android.bluetooth.BluetoothAdapter;

import dagger.Module;
import dagger.Provides;
import no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat;

/**
 * Base module for BLeScanService
 */
@Module(includes = BleScanServiceBaseModule.class)
public final class BleScanServiceModule {

  @Provides
  static BluetoothAdapter providesBluetoothAdapter() {
    return BluetoothAdapter.getDefaultAdapter();
  }

  @Provides
  static BluetoothLeScannerCompat providesBluetoothLeScannerCompat() {
    return BluetoothLeScannerCompat.getScanner();
  }
}
